
  package gen;
  public class J_Gen158 {
  		@com.google.inject.Inject
  		public J_Gen158(J_Gen159 j_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  