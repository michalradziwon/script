
  package gen;
  public class M_Gen98 {
  		@com.google.inject.Inject
  		public M_Gen98(M_Gen99 m_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  