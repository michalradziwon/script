
  package gen;
  public class Q_Gen138 {
  		@com.google.inject.Inject
  		public Q_Gen138(Q_Gen139 q_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  