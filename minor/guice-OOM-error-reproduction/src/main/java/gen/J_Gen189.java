
  package gen;
  public class J_Gen189 {
  		@com.google.inject.Inject
  		public J_Gen189(J_Gen190 j_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  