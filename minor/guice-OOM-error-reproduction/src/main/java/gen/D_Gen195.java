
  package gen;
  public class D_Gen195 {
  		@com.google.inject.Inject
  		public D_Gen195(D_Gen196 d_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  