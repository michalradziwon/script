
  package gen;
  public class F_Gen159 {
  		@com.google.inject.Inject
  		public F_Gen159(F_Gen160 f_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  