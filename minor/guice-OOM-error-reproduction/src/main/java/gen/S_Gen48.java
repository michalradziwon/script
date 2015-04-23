
  package gen;
  public class S_Gen48 {
  		@com.google.inject.Inject
  		public S_Gen48(S_Gen49 s_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  