
  package gen;
  public class D_Gen60 {
  		@com.google.inject.Inject
  		public D_Gen60(D_Gen61 d_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  