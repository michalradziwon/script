
  package gen;
  public class D_Gen159 {
  		@com.google.inject.Inject
  		public D_Gen159(D_Gen160 d_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  