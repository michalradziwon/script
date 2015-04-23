
  package gen;
  public class J_Gen107 {
  		@com.google.inject.Inject
  		public J_Gen107(J_Gen108 j_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  