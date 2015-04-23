
  package gen;
  public class Z_Gen159 {
  		@com.google.inject.Inject
  		public Z_Gen159(Z_Gen160 z_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  