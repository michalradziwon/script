
  package gen;
  public class D_Gen151 {
  		@com.google.inject.Inject
  		public D_Gen151(D_Gen152 d_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  