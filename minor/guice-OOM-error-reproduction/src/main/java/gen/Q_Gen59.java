
  package gen;
  public class Q_Gen59 {
  		@com.google.inject.Inject
  		public Q_Gen59(Q_Gen60 q_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  