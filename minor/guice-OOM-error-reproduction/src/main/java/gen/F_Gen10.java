
  package gen;
  public class F_Gen10 {
  		@com.google.inject.Inject
  		public F_Gen10(F_Gen11 f_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  