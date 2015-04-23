
  package gen;
  public class J_Gen151 {
  		@com.google.inject.Inject
  		public J_Gen151(J_Gen152 j_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  