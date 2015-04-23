
  package gen;
  public class F_Gen12 {
  		@com.google.inject.Inject
  		public F_Gen12(F_Gen13 f_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  