
  package gen;
  public class B_Gen159 {
  		@com.google.inject.Inject
  		public B_Gen159(B_Gen160 b_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  