
  package gen;
  public class Q_Gen98 {
  		@com.google.inject.Inject
  		public Q_Gen98(Q_Gen99 q_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  