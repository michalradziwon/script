
  package gen;
  public class S_Gen7 {
  		@com.google.inject.Inject
  		public S_Gen7(S_Gen8 s_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  