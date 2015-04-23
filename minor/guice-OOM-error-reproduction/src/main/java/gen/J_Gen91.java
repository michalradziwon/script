
  package gen;
  public class J_Gen91 {
  		@com.google.inject.Inject
  		public J_Gen91(J_Gen92 j_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  