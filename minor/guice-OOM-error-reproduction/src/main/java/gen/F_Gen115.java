
  package gen;
  public class F_Gen115 {
  		@com.google.inject.Inject
  		public F_Gen115(F_Gen116 f_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  