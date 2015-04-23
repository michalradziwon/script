
  package gen;
  public class D_Gen34 {
  		@com.google.inject.Inject
  		public D_Gen34(D_Gen35 d_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  