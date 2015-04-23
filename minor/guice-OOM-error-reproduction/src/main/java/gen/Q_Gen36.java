
  package gen;
  public class Q_Gen36 {
  		@com.google.inject.Inject
  		public Q_Gen36(Q_Gen37 q_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  