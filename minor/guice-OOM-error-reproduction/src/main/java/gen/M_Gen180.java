
  package gen;
  public class M_Gen180 {
  		@com.google.inject.Inject
  		public M_Gen180(M_Gen181 m_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  