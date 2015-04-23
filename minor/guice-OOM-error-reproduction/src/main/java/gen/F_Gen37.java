
  package gen;
  public class F_Gen37 {
  		@com.google.inject.Inject
  		public F_Gen37(F_Gen38 f_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  