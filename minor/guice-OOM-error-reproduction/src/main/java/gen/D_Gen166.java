
  package gen;
  public class D_Gen166 {
  		@com.google.inject.Inject
  		public D_Gen166(D_Gen167 d_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  