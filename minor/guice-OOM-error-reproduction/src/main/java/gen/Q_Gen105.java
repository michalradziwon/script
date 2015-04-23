
  package gen;
  public class Q_Gen105 {
  		@com.google.inject.Inject
  		public Q_Gen105(Q_Gen106 q_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  