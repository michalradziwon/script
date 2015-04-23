
  package gen;
  public class O_Gen100 {
  		@com.google.inject.Inject
  		public O_Gen100(O_Gen101 o_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  