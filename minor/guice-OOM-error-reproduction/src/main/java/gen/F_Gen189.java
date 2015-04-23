
  package gen;
  public class F_Gen189 {
  		@com.google.inject.Inject
  		public F_Gen189(F_Gen190 f_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  