
  package gen;
  public class F_Gen107 {
  		@com.google.inject.Inject
  		public F_Gen107(F_Gen108 f_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  