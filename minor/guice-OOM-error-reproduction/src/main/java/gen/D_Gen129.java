
  package gen;
  public class D_Gen129 {
  		@com.google.inject.Inject
  		public D_Gen129(D_Gen130 d_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  