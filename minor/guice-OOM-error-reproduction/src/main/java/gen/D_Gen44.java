
  package gen;
  public class D_Gen44 {
  		@com.google.inject.Inject
  		public D_Gen44(D_Gen45 d_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  