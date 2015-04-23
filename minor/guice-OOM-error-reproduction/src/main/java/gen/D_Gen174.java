
  package gen;
  public class D_Gen174 {
  		@com.google.inject.Inject
  		public D_Gen174(D_Gen175 d_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  