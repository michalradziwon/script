
  package gen;
  public class D_Gen53 {
  		@com.google.inject.Inject
  		public D_Gen53(D_Gen54 d_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  