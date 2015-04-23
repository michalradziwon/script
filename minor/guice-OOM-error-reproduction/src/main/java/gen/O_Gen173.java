
  package gen;
  public class O_Gen173 {
  		@com.google.inject.Inject
  		public O_Gen173(O_Gen174 o_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  