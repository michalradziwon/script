
  package gen;
  public class S_Gen189 {
  		@com.google.inject.Inject
  		public S_Gen189(S_Gen190 s_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  