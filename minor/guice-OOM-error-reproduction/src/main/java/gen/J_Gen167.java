
  package gen;
  public class J_Gen167 {
  		@com.google.inject.Inject
  		public J_Gen167(J_Gen168 j_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  