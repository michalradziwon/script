
  package gen;
  public class S_Gen30 {
  		@com.google.inject.Inject
  		public S_Gen30(S_Gen31 s_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  