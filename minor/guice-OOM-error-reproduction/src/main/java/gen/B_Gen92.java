
  package gen;
  public class B_Gen92 {
  		@com.google.inject.Inject
  		public B_Gen92(B_Gen93 b_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  