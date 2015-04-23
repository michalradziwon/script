
  package gen;
  public class D_Gen13 {
  		@com.google.inject.Inject
  		public D_Gen13(D_Gen14 d_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  