
  package gen;
  public class J_Gen170 {
  		@com.google.inject.Inject
  		public J_Gen170(J_Gen171 j_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  