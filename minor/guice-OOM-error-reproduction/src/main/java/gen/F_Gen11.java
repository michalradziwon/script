
  package gen;
  public class F_Gen11 {
  		@com.google.inject.Inject
  		public F_Gen11(F_Gen12 f_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  