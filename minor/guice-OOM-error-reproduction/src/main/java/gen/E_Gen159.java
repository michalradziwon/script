
  package gen;
  public class E_Gen159 {
  		@com.google.inject.Inject
  		public E_Gen159(E_Gen160 e_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  