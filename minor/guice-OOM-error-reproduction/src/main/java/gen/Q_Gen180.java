
  package gen;
  public class Q_Gen180 {
  		@com.google.inject.Inject
  		public Q_Gen180(Q_Gen181 q_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  