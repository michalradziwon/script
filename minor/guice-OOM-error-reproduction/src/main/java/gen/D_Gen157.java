
  package gen;
  public class D_Gen157 {
  		@com.google.inject.Inject
  		public D_Gen157(D_Gen158 d_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  