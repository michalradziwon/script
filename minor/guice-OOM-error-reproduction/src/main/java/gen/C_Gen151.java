
  package gen;
  public class C_Gen151 {
  		@com.google.inject.Inject
  		public C_Gen151(C_Gen152 c_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  