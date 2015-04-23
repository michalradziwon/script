
  package gen;
  public class F_Gen14 {
  		@com.google.inject.Inject
  		public F_Gen14(F_Gen15 f_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  