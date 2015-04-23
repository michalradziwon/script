
  package gen;
  public class H_Gen159 {
  		@com.google.inject.Inject
  		public H_Gen159(H_Gen160 h_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  