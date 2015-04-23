
  package gen;
  public class F_Gen36 {
  		@com.google.inject.Inject
  		public F_Gen36(F_Gen37 f_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  