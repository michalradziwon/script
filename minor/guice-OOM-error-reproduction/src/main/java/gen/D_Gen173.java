
  package gen;
  public class D_Gen173 {
  		@com.google.inject.Inject
  		public D_Gen173(D_Gen174 d_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  