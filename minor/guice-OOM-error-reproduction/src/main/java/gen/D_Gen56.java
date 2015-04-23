
  package gen;
  public class D_Gen56 {
  		@com.google.inject.Inject
  		public D_Gen56(D_Gen57 d_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  