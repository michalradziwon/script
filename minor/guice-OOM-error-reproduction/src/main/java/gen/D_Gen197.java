
  package gen;
  public class D_Gen197 {
  		@com.google.inject.Inject
  		public D_Gen197(D_Gen198 d_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  