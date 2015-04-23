
  package gen;
  public class S_Gen162 {
  		@com.google.inject.Inject
  		public S_Gen162(S_Gen163 s_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  