
  package gen;
  public class F_Gen92 {
  		@com.google.inject.Inject
  		public F_Gen92(F_Gen93 f_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  