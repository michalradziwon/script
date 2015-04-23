
  package gen;
  public class F_Gen119 {
  		@com.google.inject.Inject
  		public F_Gen119(F_Gen120 f_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  